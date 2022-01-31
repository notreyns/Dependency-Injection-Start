package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides
import java.security.Key


@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideCompTower(storage: Storage, memory: Memory, processor: Processor): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }
    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }
    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }





    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

}