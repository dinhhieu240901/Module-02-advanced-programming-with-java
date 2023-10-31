package com.codegym.baitap.Memory_Pool;

public class BulletPool extends MemoryPool<Bullet>{

    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
