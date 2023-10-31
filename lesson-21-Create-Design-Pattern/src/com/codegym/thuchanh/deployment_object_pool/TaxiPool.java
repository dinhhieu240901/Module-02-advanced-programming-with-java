package com.codegym.thuchanh.deployment_object_pool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    //Thời gian chờ đợi
    private static final long EXPIRED_TIME_IN_MILISECOND = 1200;
    // số lượng taxi tối đa mà hãng có thể quản lý
    private static final int NUMBER_OF_TAXI = 4;
    // danh sách taxi đang có sẵn danh sách sẽ được đồng bộ hóa để tránh nhiều luồng truy cập
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    //danh sách taxi đã được sử dụng
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());
    //biến đếm số lượng taxi hiện tại đảm bảo tính toàn ven khi nhiều luồng truy cập
    private final AtomicInteger count = new AtomicInteger(0);
    //Biến kiểm tra xem khách hàng có đang chờ taxi hay không
    private final AtomicBoolean waiting = new AtomicBoolean(false);
    //Quy trình sau khi phục vụ xong khách hàng của một taxi
    public synchronized void release(Taxi taxi) {
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }

    public synchronized Taxi getTaxi() throws TaxiNotFoundException {
        if (!available.isEmpty()) {
            Taxi taxi = available.get(0);
            inUse.add(taxi);
            return taxi;
        }
        if (count.get() == NUMBER_OF_TAXI) {
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }
        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
    }
    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + " isCreated");
        return taxi;
    }


    private void waitingUntilTaxiAvailable() throws TaxiNotFoundException {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi avaiable");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILISECOND);
    }

    private void waiting(long time) {
        try {
            TimeUnit.MICROSECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }


}
