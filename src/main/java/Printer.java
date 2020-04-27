public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(){

    }

    public void setSheetsLeft(int sheets){
        this.sheetsLeft= sheets;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void print(int numberPages, int numberCopies){
        int totalPages= numberPages*numberCopies;
        if(totalPages <= this.sheetsLeft && this.tonerVolume!= 0){
            this.sheetsLeft-= totalPages;
            this.tonerVolume-= (1*totalPages);
        }
    }

}
