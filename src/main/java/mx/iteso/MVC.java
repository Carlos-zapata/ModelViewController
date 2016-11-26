package mx.iteso;

/**
 * Created by Carlos Flores on 24/11/2016.
 */
public class MVC {

        public static void main(String[] args) {


            // search for car based on the serial number in the database
            Car model  = retriveCarFromDatabase();

            // create a view to write car details on console
            CarView view = new CarView();

            CarController controller = new CarController(model, view);

            controller.updateView();

            //update model data
            controller.setBrand("Bugatti");
            controller.setSn("834848403840");

            controller.updateView();
        }

        private static Car retriveCarFromDatabase(){
            Car car = new Car();
            car.setBrand("Ferrari");
            car.setSn("194930942090");
            return car;
        }
    }

