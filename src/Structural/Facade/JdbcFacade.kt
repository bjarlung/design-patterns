package Structural.Facade

// JDBC ha all logik dold i egen klass
// Connection, hämta singleton, och alla DB statements
class JdbcFacade(){
    //DbSingleton instance = DbSingleton.getInstance();

    //I varje metod:
    //Connection conn =instance.getConnection();
    //try {
    //Statement sta = conn.createStatement();
    //ex:
    //Resultset rs = sta.executeQuery("SELECT * FROM Address");
    //while(rs.next()) { addressList.add(Address(rs.getString(1) etc
    //rs.close()
    //sta.close()
    //conn.close()


    private lateinit var addressList: List<Address>

    fun createTable(): Unit {
        println("Creating table with JDBC")
    }

    fun insertIntoTable(): Unit {
        val address: Address = Address(1, "Mörbydalen 2", "Stockholm")
        val address2: Address = Address(2, "Ekenbergsvägen 11", "Solna")
        addressList = mutableListOf(address,address2)
    }

    fun getAddresses(): List<Address> {
        return addressList
    }

}

data class Address(val id: Int, val streetName: String, val city: String);