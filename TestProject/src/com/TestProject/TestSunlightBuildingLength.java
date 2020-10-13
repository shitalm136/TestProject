package com.TestProject;

public class TestSunlightBuildingLength {

	public static void main(String[] args) {
		
		sunExposedBuilding sb=new sunExposedBuilding();
		
		//for case -1 input
		PointCo b1[]= {new PointCo(4, 0),new PointCo(4, -5),new PointCo(7, -5),new PointCo(7, 0)};
		
		PointCo p1=new PointCo(1, 1);
		
		double l1=sb.findLength(b1, p1);
		System.out.println("case-1 output => "+l1);
		
		
		PointCo b2[][]= {{new PointCo(4, 0),new PointCo(4, -5),new PointCo(7, -5),new PointCo(7, 0)},
						{new PointCo(0.4, -2),new PointCo(0.4, -5),new PointCo(2.5, -5),new PointCo(2.5, -2)}};

		PointCo p2=new PointCo(-3.5, 1);
		double l2=sb.findLength1(b2, p2);
		System.out.println("case-2 output => "+l2);
	}

}


 class PointCo{
	
	public double x;
	public double y;
	
	PointCo(double d,double y){
		this.x=d;
		this.y=y;
	}
}
 class sunExposedBuilding{
	 
	 public double findLength(PointCo[] b1 , PointCo s) {
		 
		 
		 
		 
		 double minX = b1[0].x, maxX =  b1[0].x;
		 double minY =  b1[0].y, maxY =  b1[0].y;
		   
		    	 
				  for (int i = 0; i <  b1.length; i++) 
				  {
					  PointCo t =  b1[i];
		        minX = Math.min(t.x, minX);
		        maxX = Math.max(t.x, maxX);
		        minY = Math.min(t.y, minY);
		        maxY = Math.max(t.y, maxY);
		        
		    }
		
				  
				  double l1=(maxX-minX)+(maxY-minY);
		 
		 
		 
		 
		return l1;
		 
		 
	 }
	 
	 
	 
public double findLength1(PointCo[][] b1, PointCo s) {
		 
		 
		 
		 
		 double minX = b1[0][0].x, maxX =  b1[0][0].x;
		 double minY =  b1[0][0].y, maxY =  b1[0][0].y;
		 double max2X =  b1[0][0].x,max2Y =b1[0][1].y;
		   
		    	 
				  for (int i = 0; i <  b1.length; i++) 
				  {
					  for(int j=0;j<b1[i].length;j++) 
					  {
						  PointCo t =  b1[i][j];
			        minX = Math.min(t.x, minX);
			        maxX = Math.max(t.x, maxX);
			        minY = Math.min(t.y, minY);
			        maxY = Math.max(t.y, maxY);
			        
			        if(max2X > maxX ) 
			        {
			        	max2X=maxX;
			        	maxX=max2X;
			        }
			        
			        if(max2Y > maxY ) 
			        {
			        	max2Y=maxY;
			        	maxY=max2Y;
			        }
			        
			        
			      }
				}
				  
				  double l1=(max2X-maxX)-(minY-max2X);
		 
		 
		 
		 
		return l1;
		 
		 
	 }
	 
	
}
	 