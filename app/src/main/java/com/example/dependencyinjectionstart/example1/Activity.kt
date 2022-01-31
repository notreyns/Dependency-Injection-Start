package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {


   @Inject
   lateinit var keyBoard: Keyboard

   init {
       //Component().inject(this)
      DaggerNewComponent.create().inject(this)
   }
}