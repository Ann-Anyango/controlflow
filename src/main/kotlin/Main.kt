fun main() {
    ageClassifier(21)
    classification(12)
    haveYouBeen("Tanzania")
    haveYouBeen("Kenya")
    haveYouBeen("Sudan")
    haveYouBeen("Rwanda")
    haveYouBeen("Uganda")
    passangers(7)
    numbers(76)
    mixed(3,)
    println(mixedArray(arrayOf("sammy",23,46.6,73.8)))



}
fun ageClassifier(age:Int){
    if(age in 13 ..19){
        println("You are a teenager")

    }
    else{
        println("You are not a teenager")
    }
}
// baby 1, todler 2-3,child 4-12,adult,retiree 60
fun classification(age: Int){
    if (age in 2..3){
        println("You are a tolder")
    }
    else if(age in 0..1){
        println("you are a baby")

        }
     else if(age in 4..12){
        println("you are a Child")
    }
    else if(age in 54 ..17){
        println("you are a adult")
}
    else if(age in 18..60){
        println("you are a returee")
        }


    }
fun haveYouBeen(nationality:String){
    when (nationality){
                "Kenya"-> println("Have you been to Nairobi")
        "Rwanda"-> println("Have you been to Kigali")
        "Tanzania"-> println("Have you been to Dodoma")
        "Uganda"-> println("Have you been to Kampala")
        "Sudan"-> println("Have you been to khartoum")
        else -> println("Hve you been in East Africa")

    }

}
fun passangers(people:Int){
  when(people){
      2 -> println("coupe")
      4,5-> println("sedan")
      6,7-> println("wagan ")
      else -> println("not  recognised")
  }


    }
fun numbers(num:Array<Int>){
    for (num in nums){
        if (num % 2==0){
            println("Even")
        }
        else{
            println("odd")
        }
    }

    }
fun mixedArray (num: Array<Any>): Double{
  var mixed =0.0
    for (element in arr){
        if (element is Double){
            mixed += element
        }
    }
    return mixed

    }


fun sumArray(nums:Array<Int>): Int{
    var sum=0
    for (num in nums){
        sum +=num
    }
    return sum

}