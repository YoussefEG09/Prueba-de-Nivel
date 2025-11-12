import Enums.PropulsionSystem;
import Enums.TractionType;
import Models.Aerial;
import Models.Aquatic;
import Models.Land;
import Service.RobotConsultor;

import java.util.Date;

public class RobotMain {
    static void main() {
        RobotConsultor consultor = new RobotConsultor();

        Land robot1 = new Land("TankBot" , "RoboCorp" , 2022, new Date(), 40, TractionType.TRACKS);
        Aquatic robot2 = new Aquatic("AquaRunner", "AquaTech", 2021, new Date(), 500, PropulsionSystem.PROPELLER);
        Aerial robot3 = new Aerial("SkyDancer", "AeroDynamics", 2023, new Date(), 3000.0, 90);

        consultor.registerRobot(robot1);
        consultor.registerRobot(robot2);
        consultor.registerRobot(robot3);

        System.out.println(consultor.getRobotByManufacturer("RoboCorp"));

    }
}
