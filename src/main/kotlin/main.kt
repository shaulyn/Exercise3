import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите сумму: ")
    val sum = sc.nextInt()
    println("Вы постоянный клиент(напишите да или нет): ")
    val client = sc.next()
    val discount = if(client=="да"){true}else{false}

    val allDiscount= if(sum<1000){
        println("стоимость покупки — $sum рублей")
    }else if(sum>1001&&sum<10000&&discount==false){
        println("стоимость покупки — ${sum-100} рублей, скидка 100р")
    }else if(sum>=1001&&sum<10000&&discount==true){
        var sum1 = sum-100
        var sum2: Int =sum1-(sum1*1/100)
        println("стоимость покупки — $sum2, скидка 100р и 1% как постояннный покупатель")
    }else if(sum>=10001&&discount==false){
        println("стоимость покупки — ${sum*5/100} рублей, скидка 5%")
    } else {
        var sum1 = sum-(sum*5/100)
        var sum2: Int =sum1-(sum1*1/100)
        println("стоимость покупки — $sum2 рублей, скидка 5% и 1% как постояннный покупатель")
    }
}
