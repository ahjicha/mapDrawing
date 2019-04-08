import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;


public class RoomViewController implements Initializable {


    public Group polygonGroup;

    public ImageView polygonView;

    public AnchorPane polygonAnchor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //create the zones and rooms as polygons
        Polygon workzoneOne = new Polygon();
        Polygon workzoneTwo = new Polygon();
        Polygon workzoneThree = new Polygon();
        Polygon workzoneFour = new Polygon();
        Polygon workzoneFive = new Polygon();
        Polygon classroomOne = new Polygon();
        Polygon classroomTwo = new Polygon();
        Polygon classroomThree = new Polygon();
        Polygon classroomFour = new Polygon();
        Polygon classroomFive = new Polygon();
        Polygon classroomSix = new Polygon();
        Polygon classroomSeven = new Polygon();
        Polygon classroomEight = new Polygon();
        Polygon classroomNine = new Polygon();
        Polygon auditorium = new Polygon();

        //assign boundaries to the polygons
        classroomOne.getPoints().addAll(new Double[]{
                //coordinate 1
                869.8,624.0,
                //coordinate 2
                1038.2,624.0,
                //coordinate 3
                1038.2,722.8,
                //coordinate 4
                869.8,722.8,


        });

        classroomTwo.getPoints().addAll(new Double[]{
                //coordinate 1
                1105.0,434.3,
                //coordinate 2
                1186.0,404.7,
                //coordinate 3
                1238.8,551.0,
                //coordinate 4
                1158.6,580.3,

        });


        classroomThree.getPoints().addAll(new Double[]{
                //coordinate 1
                1048.0,276.3,
                //coordinate 2
                1150.6,245.5,
                //coordinate 3
                1204.0,396.3,
                //coordinate 4
                1105.0,434.3,

        });

        classroomFour.getPoints().addAll(new Double[]{
                //coordinate 1
                942.0,74.5,
                //coordinate 2
                1014.9,74.5,
                //coordinate 3
                1063.6,205.6,
                //coordinate 4
                1026.7,205.6,
                //coordinate 5
                1026.7,211.7,
                //coordinate 6
                995.2,211.7,
                //coordinate 7
                995.2,205.6,
                //coordinate 8
                942.0,205.6,

        });

        classroomFive.getPoints().addAll(new Double[]{
                //coordinate 1
                871.7,287.3,
                //coordinate 2
                963.7,287.3,
                //coordinate 3
                963.7,274.4,
                //coordinate 4
                993.7,274.4,
                //coordinate 5
                993.7,421.0,
                //coordinate 6
                871.7,421.0,

        });

        classroomSix.getPoints().addAll(new Double[]{
                //coordinate 1
                818.5,74.9,
                //coordinate 2
                941.6,74.9,
                //coordinate 3
                941.6,210.1,
                //coordinate 4
                818.5,210.1,

        });

        classroomSeven.getPoints().addAll(new Double[]{
                //coordinate 1
                781.7,289.2,
                //coordinate 2
                838.3,289.2,
                //coordinate 3
                838.3,270.6,
                //coordinate 4
                863.7,270.6,
                //coordinate 5
                863.7,289.2,
                //coordinate 6
                871.3,289.2,
                //coordinate 7
                871.3,419.9,
                //coordinate 8
                781.7,419.9,


        });

        classroomEight.getPoints().addAll(new Double[]{
                //coordinate 1
                686.3,74.5,
                //coordinate 2
                818.6,74.5,
                //coordinate 3
                818.6,209.8,
                //coordinate 4
                686.3,209.8,

        });


        classroomNine.getPoints().addAll(new Double[]{
                //coordinate 1
                695.8,273.2,
                //coordinate 2
                727.7,273.2,
                //coordinate 3
                727.7,289.2,
                //coordinate 4
                780.9,289.2,
                //coordinate 5
                780.9,360.2,
                //coordinate 6
                695.8,360.2,

        });

        workzoneOne.getPoints().addAll(new Double[]{
                //coordinate 1
                354.0,339.6,
                //coordinate 2
                436.0,339.6,
                //coordinate 3
                436.0,368.6,
                //coordinate 4
                578.6,368.6,
                //coordinate 5
                578.6,288.4,
                //coordinate 6
                671.8,288.4,
                //coordinate 7
                671.8,260.7,
                //coordinate 8
                688.5,260.7,
                //coordinate 9
                688.5,365.8,
                //coordinate 10
                726.7,364.8,
                //coordinate 11
                726.7,421.0,
                //coordinate 12
                746.4,421.0,
                //coordinate 13
                746.4,453.7,
                //coordinate 14
                688.3,453.7,
                //coordinate 15
                688.3,646.8,
                //coordinate 16
                507.4,646.8,
                //coordinate 17
                507.4,700.0,
                //coordinate 18
                413.8,700.0,
                //coordinate 19
                413.8,649.5,
                //coordinate 20
                354.0,649.5,

        });

        workzoneTwo.getPoints().addAll(new Double[]{
                //coordinate 1
                391.0, 72.4,
                //coordinate 2
                391.0, 224.0,
                //coordinate 3
                434.8, 224.0,
                //coordinate 4
                434.8,368.4,
                //coordinate 5
                577.6,368.4,
                //coordinate 6
                577.6,288.4,
                //coordinate 7
                671.8,288.4,
                //coordinate 8
                671.8,260.7,
                //coordinate 9
                685.5,260.7,
                //coordinate 10
                685.5,72.4,

        });

        workzoneThree.getPoints().addAll(new Double[]{
                //coordinate 1
                77.7, 72.4,
                //coordinate 2
                77.7, 421.5,
                //coordinate 3
                297.5, 421.5,
                //coordinate 4
                297.5, 367.8,
                //coordinate 5
                354.0, 367.8,
                //coordinate 6
                354.0, 341.4,
                //coordinate 7
                434.8, 341.4,
                //coordinate 8
                434.8, 224.0,
                //coordinate 9
                391.0, 224.0,
                //coordinate 10
                391.0, 72.4,

        });

        workzoneFour.getPoints().addAll(new Double[]{
                //coordinate 1
                77.0, 421.5,
                //coordinate 2
                77.0, 702.0,
                //coordinate 3
                297.5, 702.0,
                //coordinate 4
                297.5, 649.0,
                //coordinate 5
                354.0, 649.0,
                //coordinate 6
                354.0, 421.5,

        });

        workzoneFive.getPoints().addAll(new Double[]{
                //coordinate 1
                507.4,646.76,
                //coordinate 2
                507.4,1005.1,
                //coordinate 3
                892.0,1005.1,
                //coordinate 4
                892.0,816.3,
                //coordinate 5
                861.5,816.3,
                //coordinate 6
                861.5,646.8,
                //coordinate 7
                727.0,646.8,
                //coordinate 8
                727.0,610.3,
                //coordinate 9
                688.3,610.3,
                //coordinate 10
                688.3,646.8,

        });

        auditorium.getPoints().addAll(new Double[]{
                //coordinate 1
                1178.8,572.3,
                //coordinate 2
                1269.6,540.4,
                //coordinate 3
                1335.3,699.0,
                //coordinate 4
                1240.7,824.92,
                //coordinate 5
                1100.0,823.1,
                //coordinate 6
                1105.0,731.5,
                //coordinate 7
                1117.6,731.5,
                //coordinate 8
                1117.6,722.76,
                //coordinate 9
                1177.2,611.0,
                //coordinate 10
                1192.1,606.1,

        });


        Color sea = Color.web("0x032c59", 0.5);
        //setting the fill color
        workzoneFive.setFill(sea);
        workzoneFour.setFill(sea);
        workzoneThree.setFill(sea);
        workzoneTwo.setFill(sea);
        workzoneOne.setFill(sea);

        classroomOne.setFill(sea);
        classroomTwo.setFill(sea);
        classroomThree.setFill(sea);
        classroomFour.setFill(sea);
        classroomFive.setFill(sea);
        classroomSix.setFill(sea);
        classroomSeven.setFill(sea);
        classroomEight.setFill(sea);
        classroomNine.setFill(sea);
        auditorium.setFill(sea);

        //resizing and scaling
        polygonGroup.setScaleX(.2);
        polygonGroup.setScaleY(.2);

        polygonGroup.setTranslateY( - (polygonGroup.getBoundsInLocal().getHeight() - polygonGroup.getBoundsInParent().getHeight())/2);
        polygonGroup.setTranslateX( - (polygonGroup.getBoundsInLocal().getWidth() - polygonGroup.getBoundsInParent().getWidth())/2);


        //adding the polygons to the group
        polygonGroup.getChildren().add(workzoneFive);
        polygonGroup.getChildren().add(workzoneFour);
        polygonGroup.getChildren().add(workzoneThree);
        polygonGroup.getChildren().add(workzoneTwo);
        polygonGroup.getChildren().add(workzoneOne);

        polygonGroup.getChildren().add(classroomOne);
        polygonGroup.getChildren().add(classroomTwo);
        polygonGroup.getChildren().add(classroomThree);
        polygonGroup.getChildren().add(classroomFour);
        polygonGroup.getChildren().add(classroomFive);
        polygonGroup.getChildren().add(classroomSix);
        polygonGroup.getChildren().add(classroomSeven);
        polygonGroup.getChildren().add(classroomEight);
        polygonGroup.getChildren().add(classroomNine);

        polygonGroup.getChildren().add(auditorium);

    }


}
