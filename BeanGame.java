
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
		
		GamePane.requestFocus();
		GamePane.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.SPACE){
				MoveBall();
			}
		});
		
	}
	
	class GamePane extends Pane{
		public GamePane(){
			//彈珠檯外框
			Line lineUp1 = new Line(230, 50, 230, 90);
			lineUp1.setStrokeWidth(5);
			lineUp1.setStroke(Color.GREEN);
			getChildren().add(lineUp1);
			
			Line lineUp2 = new Line(270, 50, 270, 90);
			lineUp2.setStrokeWidth(5);
			lineUp2.setStroke(Color.GREEN);
			getChildren().add(lineUp2);
			
			Line lineUp3 = new Line(230, 90, 100, 350);
			lineUp3.setStrokeWidth(5);
			lineUp3.setStroke(Color.GREEN);
			getChildren().add(lineUp3);
			
			Line lineUp4 = new Line(270, 90, 400, 350);
			lineUp4.setStrokeWidth(5);
			lineUp4.setStroke(Color.GREEN);
			getChildren().add(lineUp4);
			
			Line lineDown1 = new Line(100, 350, 100, 440);
			lineDown1.setStrokeWidth(5);
			lineDown1.setStroke(Color.GREEN);
			getChildren().add(lineDown1);
			
			Line lineDown2 = new Line(400, 350, 400, 440);
			lineDown2.setStrokeWidth(5);
			lineDown2.setStroke(Color.GREEN);
			getChildren().add(lineDown2);
			
			Line lineDown3 = new Line(100, 440, 400, 440);
			lineDown3.setStrokeWidth(5);
			lineDown3.setStroke(Color.GREEN);
			getChildren().add(lineDown3);
			
			//彈珠檯內部分隔
			Line lineM1 = new Line(138, 350, 138, 440);
			lineM1.setStrokeWidth(5);
			lineM1.setStroke(Color.BLUE);
			getChildren().add(lineM1);
			
			Line lineM2 = new Line(175, 350, 175, 440);
			lineM2.setStrokeWidth(5);
			lineM2.setStroke(Color.BLUE);
			getChildren().add(lineM2);
			
			Line lineM3 = new Line(213, 350, 213, 440);
			lineM3.setStrokeWidth(5);
			lineM3.setStroke(Color.BLUE);
			getChildren().add(lineM3);
			
			Line lineM4 = new Line(250, 350, 250, 440);
			lineM4.setStrokeWidth(5);
			lineM4.setStroke(Color.BLUE);
			getChildren().add(lineM4);
			
			Line lineM5 = new Line(288, 350, 288, 440);
			lineM5.setStrokeWidth(5);
			lineM5.setStroke(Color.BLUE);
			getChildren().add(lineM5);
			
			Line lineM6 = new Line(325, 350, 325, 440);
			lineM6.setStrokeWidth(5);
			lineM6.setStroke(Color.BLUE);
			getChildren().add(lineM6);
			
			Line lineM7 = new Line(363, 350, 363, 440);
			lineM7.setStrokeWidth(5);
			lineM7.setStroke(Color.BLUE);
			getChildren().add(lineM7);
			
			//彈珠檯阻礙
			//第一層
			Circle dot1 = new Circle();
			dot1.setCenterX(250);
			dot1.setCenterY(110);
			dot1.setRadius(4);
			dot1.setStrokeWidth(8);
			dot1.setStroke(Color.RED);
			getChildren().add(dot1);
			//第二層
			Circle dot2 = new Circle();
			dot2.setCenterX(232);
			dot2.setCenterY(150);
			dot2.setRadius(4);
			dot2.setStrokeWidth(8);
			dot2.setStroke(Color.RED);
			getChildren().add(dot2);
			
			Circle dot3 = new Circle();
			dot3.setCenterX(269);
			dot3.setCenterY(150);
			dot3.setRadius(4);
			dot3.setStrokeWidth(8);
			dot3.setStroke(Color.RED);
			getChildren().add(dot3);
			//第三層
			Circle dot4 = new Circle();
			dot4.setCenterX(213);
			dot4.setCenterY(190);
			dot4.setRadius(4);
			dot4.setStrokeWidth(8);
			dot4.setStroke(Color.RED);
			getChildren().add(dot4);
			
			Circle dot5 = new Circle();
			dot5.setCenterX(250);
			dot5.setCenterY(190);
			dot5.setRadius(4);
			dot5.setStrokeWidth(8);
			dot5.setStroke(Color.RED);
			getChildren().add(dot5);
			
			Circle dot6 = new Circle();
			dot6.setCenterX(288);
			dot6.setCenterY(190);
			dot6.setRadius(4);
			dot6.setStrokeWidth(8);
			dot6.setStroke(Color.RED);
			getChildren().add(dot6);
			//第四層
			Circle dot7 = new Circle();
			dot7.setCenterX(194);
			dot7.setCenterY(230);
			dot7.setRadius(4);
			dot7.setStrokeWidth(8);
			dot7.setStroke(Color.RED);
			getChildren().add(dot7);
			
			Circle dot8 = new Circle();
			dot8.setCenterX(232);
			dot8.setCenterY(230);
			dot8.setRadius(4);
			dot8.setStrokeWidth(8);
			dot8.setStroke(Color.RED);
			getChildren().add(dot8);
			
			Circle dot9 = new Circle();
			dot9.setCenterX(269);
			dot9.setCenterY(230);
			dot9.setRadius(4);
			dot9.setStrokeWidth(8);
			dot9.setStroke(Color.RED);
			getChildren().add(dot9);
			
			Circle dot10 = new Circle();
			dot10.setCenterX(307);
			dot10.setCenterY(230);
			dot10.setRadius(4);
			dot10.setStrokeWidth(8);
			dot10.setStroke(Color.RED);
			getChildren().add(dot10);
			//第五層
			Circle dot11 = new Circle();
			dot11.setCenterX(175);
			dot11.setCenterY(270);
			dot11.setRadius(4);
			dot11.setStrokeWidth(8);
			dot11.setStroke(Color.RED);
			getChildren().add(dot11);
			
			Circle dot12 = new Circle();
			dot12.setCenterX(213);
			dot12.setCenterY(270);
			dot12.setRadius(4);
			dot12.setStrokeWidth(8);
			dot12.setStroke(Color.RED);
			getChildren().add(dot12);
			
			Circle dot13 = new Circle();
			dot13.setCenterX(250);
			dot13.setCenterY(270);
			dot13.setRadius(4);
			dot13.setStrokeWidth(8);
			dot13.setStroke(Color.RED);
			getChildren().add(dot13);
			
			Circle dot14 = new Circle();
			dot14.setCenterX(288);
			dot14.setCenterY(270);
			dot14.setRadius(4);
			dot14.setStrokeWidth(8);
			dot14.setStroke(Color.RED);
			getChildren().add(dot14);
			
			Circle dot15 = new Circle();
			dot15.setCenterX(325);
			dot15.setCenterY(270);
			dot15.setRadius(4);
			dot15.setStrokeWidth(8);
			dot15.setStroke(Color.RED);
			getChildren().add(dot15);
			//第六層
			Circle dot16 = new Circle();
			dot16.setCenterX(157);
			dot16.setCenterY(310);
			dot16.setRadius(4);
			dot16.setStrokeWidth(8);
			dot16.setStroke(Color.RED);
			getChildren().add(dot16);
			
			Circle dot17 = new Circle();
			dot17.setCenterX(194);
			dot17.setCenterY(310);
			dot17.setRadius(4);
			dot17.setStrokeWidth(8);
			dot17.setStroke(Color.RED);
			getChildren().add(dot17);
			
			Circle dot18 = new Circle();
			dot18.setCenterX(232);
			dot18.setCenterY(310);
			dot18.setRadius(4);
			dot18.setStrokeWidth(8);
			dot18.setStroke(Color.RED);
			getChildren().add(dot18);
			
			Circle dot19 = new Circle();
			dot19.setCenterX(269);
			dot19.setCenterY(310);
			dot19.setRadius(4);
			dot19.setStrokeWidth(8);
			dot19.setStroke(Color.RED);
			getChildren().add(dot19);
			
			Circle dot20 = new Circle();
			dot20.setCenterX(307);
			dot20.setCenterY(310);
			dot20.setRadius(4);
			dot20.setStrokeWidth(8);
			dot20.setStroke(Color.RED);
			getChildren().add(dot20);
			
			Circle dot21 = new Circle();
			dot21.setCenterX(344);
			dot21.setCenterY(310);
			dot21.setRadius(4);
			dot21.setStrokeWidth(8);
			dot21.setStroke(Color.RED);
			getChildren().add(dot21);
			//第七層
			Circle dot22 = new Circle();
			dot22.setCenterX(138);
			dot22.setCenterY(350);
			dot22.setRadius(4);
			dot22.setStrokeWidth(8);
			dot22.setStroke(Color.RED);
			getChildren().add(dot22);
			
			Circle dot23 = new Circle();
			dot23.setCenterX(175);
			dot23.setCenterY(350);
			dot23.setRadius(4);
			dot23.setStrokeWidth(8);
			dot23.setStroke(Color.RED);
			getChildren().add(dot23);
			
			Circle dot24 = new Circle();
			dot24.setCenterX(213);
			dot24.setCenterY(350);
			dot24.setRadius(4);
			dot24.setStrokeWidth(8);
			dot24.setStroke(Color.RED);
			getChildren().add(dot24);
			
			Circle dot25 = new Circle();
			dot25.setCenterX(250);
			dot25.setCenterY(350);
			dot25.setRadius(4);
			dot25.setStrokeWidth(8);
			dot25.setStroke(Color.RED);
			getChildren().add(dot25);
			
			Circle dot26 = new Circle();
			dot26.setCenterX(288);
			dot26.setCenterY(350);
			dot26.setRadius(4);
			dot26.setStrokeWidth(8);
			dot26.setStroke(Color.RED);
			getChildren().add(dot26);
			
			Circle dot27 = new Circle();
			dot27.setCenterX(325);
			dot27.setCenterY(350);
			dot27.setRadius(4);
			dot27.setStrokeWidth(8);
			dot27.setStroke(Color.RED);
			getChildren().add(dot27);
			
			Circle dot28 = new Circle();
			dot28.setCenterX(363);
			dot28.setCenterY(350);
			dot28.setRadius(4);
			dot28.setStrokeWidth(8);
			dot28.setStroke(Color.RED);
			getChildren().add(dot28);
			
			
		}
	}
	public void MoveBall{
		Timeline timeline = new Timeline();
        SecureRandom rand = new SecureRandom();
		int[] move = new int[7];
		for(int i = 0; i < 7; i++){
			
		}
	}
	
}








