package Service;

import Models.Land;
import Models.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RobotConsultor {
    private final List<Robot> robotList = new ArrayList<>();

    public void registerRobot(Robot robot) {
            robotList.add(robot);
    }

    public void listWithTechnicalDescription() {
            robotList.forEach(robot -> System.out.println(robot.getTechnicalDescription()));
    }

    public List<Land> getLandRobotWithSpeed(int speed) {
        return robotList.stream()
                .filter(robot -> robot instanceof Land)
                .map(robot -> (Land) robot)
                .filter(robot -> robot.getMaxSpeed() > speed)
                .collect(Collectors.toList());
    }

    public List<Robot> getRobotByManufacturer(String manufacturer) {
        return  robotList.stream()
                .filter(robot -> robot.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }
}
