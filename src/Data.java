public class Data
{

    private int ID;
    private String name;
    private Byte number;


    @Override
    public String toString() {
        return "Data{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", data='" + data + '\'' +
                '}';
    }

    public Data(String csvSor){
        String[] adatok = csvSor.split(";");

        this. ID = Integer.parseInt(adatok[0]);

        this.name = adatok[1];

        this.number = Byte.valueOf(adatok[2]);


    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Byte getNumber() {
        return number;
    }

    public void setNumber(Byte number) {
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }}

