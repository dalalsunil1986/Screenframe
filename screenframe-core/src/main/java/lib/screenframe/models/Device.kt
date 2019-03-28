package lib.screenframe.models

data class Device(val name:Name,
                  val landOffset:Bounds,
                  val portOffset:Bounds,
                  val screenSize:Bounds,
                  val physicalSize:Float,
                  val id:String
                  )