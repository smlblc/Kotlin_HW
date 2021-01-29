package sampleTask

fun main() {
    val myPrinter = Printer()
    //val dataFetcher = RatRofit(myPrinter)
    val dataFetcher = RatRofit(object : DisplayData {

        override fun showData(dataState: DataState) {
            when (dataState) {
                is DataState.Success -> {
                    print(dataState.temperatureList)
                }
                is DataState.Error -> {
                    print(dataState.errorString)
                }
                is DataState.Progress -> {
                    print("fetching the result")
                }
            }
        }

        override fun hideData() {
            // todo: if there`s a way
        }
    })

    dataFetcher.fetchTemperatureFromNetwork()

}

class Printer() : DisplayData {
    override fun showData(dataState: DataState) {
        when (dataState) {
            is DataState.Success -> { print(dataState.temperatureList) }
            is DataState.Error -> { print(dataState.errorString) }
            is DataState.Progress -> { print("fetching the result") }
        }
    }

    override fun hideData() {
        TODO("Not yet implemented")
    }
}

// you need some class that implemented your interface to be passed to constructor
class RatRofit(val device: DisplayData) {

    val temperatureData = listOf<Temperature>(
        Temperature(30, 11),
        Temperature(40, 5),
        Temperature(-5, 30)

    )

    fun fetchTemperatureFromNetwork() {
        //do calculation
        val errorResult = DataState.Error("my internet has gone")
        val succesfulResult = DataState.Success(temperatureData)
        val progress = DataState.Progress()
        
        device.showData(succesfulResult)
        //device.showData(errorResult)
    }

}

// i need a clas to implement mi interface so i can ask it to show data
data class Temperature(val windSpeed: Int = 0, val celciusDegrees: Int = 0) {

}

//I need a class that implemets my interface so I can ask it to show my data
interface DisplayData {
    fun showData(dataState: DataState)
    fun hideData()

}

sealed class DataState() {
    class Success(val temperatureList: List<Temperature>) : DataState()
    class Error(val errorString: String) : DataState()
    class Progress() : DataState()
   
}
