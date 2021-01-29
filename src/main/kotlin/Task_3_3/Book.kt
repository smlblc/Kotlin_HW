package Task_3_3

open class Book(val name: String, val author: String) {

    private var curentPage: Int = 0
    var wordCount: Int = 0

    open fun readPage(){
        curentPage++
    }
}

class eBook(format:String = "text ", name: String, author: String) : Book(name, author){
    override fun readPage() {
        wordCount += 250
    }
}

