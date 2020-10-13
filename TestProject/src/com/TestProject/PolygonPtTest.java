package com.TestProject;

class point{
	
	public double x;
	public double y;
	
	point(double x,double y){
		this.x=x;
		this.y=y;
	}
}



class PolygonTest{
	
	public boolean testPoint1(point[] poly ,point p) 
	{
		
		  boolean flag=false;
			    double minX = poly[0].x, maxX = poly[0].x;
			    double minY = poly[0].y, maxY = poly[0].y;
			   
			    	 
					  for (int i = 0; i < poly.length; i++) 
					  {
			        point t = poly[i];
			        minX = Math.min(t.x, minX);
			        maxX = Math.max(t.x, maxX);
			        minY = Math.min(t.y, minY);
			        maxY = Math.max(t.y, maxY);
			        
			    }

			    if (p.x < minX || p.x > maxX || p.y < minY || p.y > maxY) {
			        return false;
			    }
			    

			    for (int i=0, j=poly.length-1; i < poly.length; j = i++) {
			        if ( (poly[i].y > p.y) != (poly[j].y > p.y) &&
			                p.x < (poly[j].x - poly[i].x) * (p.y - poly[i].y) / 
			                (poly[j].y - poly[i].y) + poly[i].x )
			        {
			           flag = !flag;
			        }
			    }

			    return flag;
			    
	}			    
	



	
	
}

public class PolygonPtTest {

	public static void main(String[] args) {
		PolygonTest p1=new PolygonTest();
		
		/*case-1 Input -
		$ Polygon$ : $ [[1,0], [8,3], [8,8], [1,5]] $
		$ P $: $ [3,5] $
		Output : True*/
		point pt1=new point(3, 5);
		point[] polygon1 ={ new point(1,0), new point(8, 3) , new point(8, 8),new point(1, 5)}; 
		boolean testpoint1=p1.testPoint1(polygon1, pt1);
		System.out.println("case-1 Output => "+testpoint1);

		
/*		case-2 input
		$ Polygon $ : $ [[-3,2], [-2,-0.8], [0,1.2], [2.2,0], [2,4.5]]$
		$ P $ : $[0,0]$
		Output : False*/	
		point pt2=new point(0, 0);
		point[] polygon2={new point(-3, 2),new point(-2, -0.8),new point(0, 1.2),new point(2.2, 0),new point(2, 4.5)};
		boolean testpoint2=p1.testPoint1(polygon2, pt2);
		System.out.println("case-2 Output => "+testpoint2);
		

	}

}





