package arraysEasyProblems;

public class ImageSmoother
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] m=new int[3][3];
		m=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
		int[][] res=imageSmoother(m);
        int rows=res.length;
        int cols=res[0].length;
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		System.out.print(res[i][j]+" ");
        	}
        	System.out.println();
        }
	}

	private static int[][] imageSmoother(int[][] m)
	{
		// TODO Auto-generated method stub
		if(m==null)return null;
		int rows=m.length;
        int cols=m[0].length;
        if(rows==0) return new int[0][];
        
        int[][] res=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				int sum=0;
				int count=0;
				for(int incR:new int[]{-1,0,1}){
					for(int incC:new int[]{-1,0,1}){
						if(isValid(i+incR,j+incC,rows,cols)){
							sum=sum+m[i+incR][j+incC];
							count++;
						}
					}
				}
				res[i][j]=sum/count;
			}
		}
		return res;
	}

	private static boolean isValid(int i, int j, int rows, int cols)
	{
		// TODO Auto-generated method stub
		return i>=0&&i<rows&&j>=0&&j<cols;
	}

}
