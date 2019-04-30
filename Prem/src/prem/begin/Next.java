package prem.begin;

/* Bitwise: convert data into binary
 * 1024 512 256 128 64 32 16 8 4 2 1
 *                   1  1  0 0 0 0 1>> a>> 97
 *           1   1   0  0  0 0 1 0 0>> 388        
 *                   1  0  1 1 0 1 0>> Z>> 90
 *                   0  0  0 1 0 1 1>> 11
 * & >> always 1
 * | >> any 1
 * ^ >> different 1
 * 
 * <<
 * >>
 */

public class Next 
{
	public static void main(String[] args) 
	{
		char init='a',last='Z';
		System.out.println(init<<2);
		System.out.println(last>>3);
	}
}
