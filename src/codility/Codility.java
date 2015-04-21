package codility;

public class Codility {

	public void run(){
		solution(21);
	}
	
	 public int solution(int N) {
	        long L = 0;
	        long R = 1;
	        int commands = 0;
	        return solve(L,R,N, commands);
	        
	    }
	    
	    private int solve(long L, long R, int N, int commands){
	        if(L == N || R == N){
	            return commands;
	        }
	        
	        if(passN(L,N) && passN(R,N))
	            return -1;
	        
	        int resultL = -1;
	        int resultR = -1;
	        if(!passN(L,N)) {
	            resultL = solve(doL(L,R), R, N, commands+1);
	        }
	        if(!passN(R,N)){
	            resultR = solve(L, doR(L,R), N, commands+1);
	        }
	        
	        if(resultL == -1){
	            return resultR;
	        }
	        else{
	            return resultL;
	        }
	        
	    }
	    
	    private long doL(long L, long R){
	        return 2l*L - R;
	    }
	    
	    private long doR(long L, long R){
	        return 2l*R - L;
	    }
	    
	    private boolean passN(long arg, int N){
	        return Math.abs(N) < Math.abs(arg);
	    }
	    
}
