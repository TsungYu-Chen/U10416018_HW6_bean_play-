//U10416018 陳宗佑

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage){
		//Create a scene
		Scene scene = new Scene(new GamePane(), 500, 500);
		primaryStage.setTitle("Beangame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class GamePane extends Pane{
		public GamePane(){
			//彈珠檯外框
			Line lineUp1 = new Line(230, 50, 230, 90);
			lineUp1.setStrokeWidth(5);
			lineUp1.setStroke(Color.GREEN);
			
			Line lineUp2 = new Line(270, 50, 270, 90);
			lineUp2.setStrokeWidth(5);
			lineUp2.setStroke(Color.GREEN);
			
			Line lineUp3 = new Line(230, 90, 100, 350);
			lineUp3.setStrokeWidth(5);
			lineUp3.setStroke(Color.GREEN);
			
			Line lineUp4 = new Line(270, 90, 400, 350);
			lineUp4.setStrokeWidth(5);
			lineUp4.setStroke(Color.GREEN);
			
			Line lineDown1 = new Line(100, 350, 100, 440);
			lineDown1.setStrokeWidth(5);
			lineDown1.setStroke(Color.GREEN);
			
			Line lineDown2 = new Line(400, 350, 400, 440);
			lineDown2.setStrokeWidth(5);
			lineDown2.setStroke(Color.GREEN);
			
			Line lineDown3 = new Line(100, 440, 400, 440);
			lineDown3.setStrokeWidth(5);
			lineDown3.setStroke(Color.GREEN);
			
			//彈珠檯內部分隔
			Line lineM1 = new Line(138, 350, 138, 440);
			lineM1.setStrokeWidth(5);
			lineM1.setStroke(Color.BLUE);
			
			Line lineM2 = new Line(175, 350, 175, 440);
			lineM2.setStrokeWidth(5);
			lineM2.setStroke(Color.BLUE);
			
			Line lineM3 = new Line(213, 350, 213, 440);
			lineM3.setStrokeWidth(5);
			lineM3.setStroke(Color.BLUE);
			
			Line lineM4 = new Line(250, 350, 250, 440);
			lineM4.setStrokeWidth(5);
			lineM4.setStroke(Color.BLUE);
			
			Line lineM5 = new Line(288, 350, 288, 440);
			lineM5.setStrokeWidth(5);
			lineM5.setStroke(Color.BLUE);
			
			Line lineM6 = new Line(325, 350, 325, 440);
			lineM6.setStrokeWidth(5);
			lineM6.setStroke(Color.BLUE);
			
			Line lineM7 = new Line(363, 350, 363, 440);
			lineM7.setStrokeWidth(5);
			lineM7.setStroke(Color.BLUE);
			
			getChildren().addAll(lineUp1,lineUp2,lineUp3,lineUp4,lineDown1,lineDown2,lineDown3,lineM1,lineM2,lineM3,lineM4,lineM5,lineM6,lineM7);
			
			//彈珠檯阻礙
			//第一層
			Circle dot1 = new Circle(250,110,8,Color.RED);
			//第二層
			Circle dot2 = new Circle(232,150,8,Color.RED);
			
			Circle dot3 = new Circle(269,150,8,Color.RED);
			//第三層
			Circle dot4 = new Circle(213,190,8,Color.RED);
			
			Circle dot5 = new Circle(250,190,8,Color.RED);
			
			Circle dot6 = new Circle(288,190,8,Color.RED);
			//第四層
			Circle dot7 = new Circle(194,230,8,Color.RED);
			
			Circle dot8 = new Circle(232,230,8,Color.RED);
			
			Circle dot9 = new Circle(269,230,8,Color.RED);
			
			Circle dot10 = new Circle(307,230,8,Color.RED);
			//第五層
			Circle dot11 = new Circle(175,270,8,Color.RED);
			
			Circle dot12 = new Circle(213,270,8,Color.RED);
			
			Circle dot13 = new Circle(250,270,8,Color.RED);
			
			Circle dot14 = new Circle(288,270,8,Color.RED);
			
			Circle dot15 = new Circle(325,270,8,Color.RED);
			//第六層
			Circle dot16 = new Circle(157,310,8,Color.RED);
			
			Circle dot17 = new Circle(194,310,8,Color.RED);
			
			Circle dot18 = new Circle(232,310,8,Color.RED);
			
			Circle dot19 = new Circle(269,310,8,Color.RED);
		
			Circle dot20 = new Circle(307,310,8,Color.RED);
			
			Circle dot21 = new Circle(344,310,8,Color.RED);
			//第七層
			Circle dot22 = new Circle(138,350,8,Color.RED);
			
			Circle dot23 = new Circle(175,350,8,Color.RED);
			
			Circle dot24 = new Circle(213,350,8,Color.RED);
			
			Circle dot25 = new Circle(250,350,8,Color.RED);
			
			Circle dot26 = new Circle(288,350,8,Color.RED);
			
			Circle dot27 = new Circle(325,350,8,Color.RED);
			
			Circle dot28 = new Circle(363,350,8,Color.RED);
			
			getChildren().addAll(dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8,dot9,dot10,dot11,dot12,dot13,dot14,dot15,dot16,dot17,dot18,dot19,dot20,dot21,dot22,dot23,dot24,dot25,dot28);
			
		}
	}
	
}
