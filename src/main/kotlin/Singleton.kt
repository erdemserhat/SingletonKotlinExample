class Singleton private constructor() {

    companion object {
        private var instance: Singleton? = null

        fun getInstance():Singleton{
           if (instance==null){
               instance=Singleton()
               return instance as Singleton
           }else{
               return instance as Singleton
           }

    }

    }

    fun doSomething() = "Doing something"
}