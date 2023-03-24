public class Rectangle {
    private double Length;
    private double Width;
    private double Area;

    public void getdata(double Length,double Width){

        this.Length=Length;
        this.Width=Width;

    };
    public void ComputeField() {
        this.Area=this.Length*this.Width;
    }

    public void FieldDisplay(){

        System.out.println("Area is equal to :" +this.Area);


    }
}
