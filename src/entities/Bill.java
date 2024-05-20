package entities;

public class Bill {

    private int barbecue;
    private int beer;
    private char gender;
    private int softDrink;

    public double cover() {
        if(this.feeding() > 30.00) {
            return 0.00;
        } else {
            return 4.00;
        }
    }

    public double feeding() {
        return this.barbecue * 7.00 + this.beer * 5.00 + this.softDrink * 3.00;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public int getBeer() {
        return beer;
    }

    public char getGender() {
        return gender;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double ticket() {
        if (this.gender == 'F') {
            return 8.00;
        } else {
            return 10.00;
        }
    }

    public double total() {
        return this.cover() + this.feeding() + this.ticket();
    }

}
