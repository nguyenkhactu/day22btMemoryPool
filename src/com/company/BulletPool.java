package com.company;

public class BulletPool extends MemoryPool {
    @Override
    protected Object allocate() {
        return new Bullet();
    }
}
