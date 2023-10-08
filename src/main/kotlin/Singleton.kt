import java.time.Instant

class Singleton private constructor() {

    companion object {
        private var instance: Singleton? = null

        fun getInstance():Singleton{
           if (instance==null){
               instance=Singleton()
           }else{
               return instance as Singleton
           }

            return instance as Singleton

    }

    }


}