package mx.iteso;

/**
 * Created by Carlos Flores on 24/11/2016.
 */

public class CarController {
    private Car model;
    private CarView view;

    public CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
    }

    public void setBrand(String brand){
        model.setBrand(brand);
    }

    public String getBrand(){
        return model.getBrand();
    }

    public void setSn(String sn){
        model.setSn(sn);
    }

    public String getSn(){
        return model.getSn();
    }

    public void updateView(){
        view.printCarDetails(model.getBrand(), model.getSn());
    }
}