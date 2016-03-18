package testHomework;

public class triangle {
	public String typeOfTriangle (int a, int b,int c) 
	{ 
		String type = "not";
		if(a+b>c && a+c>b && c+a>b){
			type = "scalene";
			if(a==b || a==c || b==c){
				type="isosceles";
				if(a==b && b==c)
					type="equilateral";
			}
			return type;
		}
		else{
			return type;
		}
	} 
}
