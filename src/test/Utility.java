package test;
/*
 * Class contains the utility methods
 */
class Utility {
	
	/*
	 * @Discription :method truncate the string in specific format.
	 */
	static String truncate(String orderDetails, int length) {
		String replaceStr = " ... (truncated) ... ";
		String endStr = null;
		int count = 0;
//fifinalOrderDetailsn is final string to be return as a result
		StringBuilder finalOrderDetails = new StringBuilder(replaceStr);
		//below statement is to validate that if orderDetails is less than length and length is less than replaceStr do nothing
		if ((orderDetails.length() >length)&&replaceStr.length()<length) {
			//below statement is checking how many characters are required from orderDetails.
			int CharToAdd = length - replaceStr.length();

			for (int i = 1; i <= CharToAdd; i++) {

				if (count < length) {
					//Below statement is adding at the beginning of final string.
					finalOrderDetails.insert(i - 1, orderDetails.charAt(i - 1));
					endStr = orderDetails.substring(orderDetails.length() - i);
				 
					count = finalOrderDetails.length() + endStr.length();
				}

			}
			//Below statement is adding at the end of final string.
			
		
			finalOrderDetails.append(endStr);

		}else{
			return orderDetails;
		}
		return finalOrderDetails.toString();

	}
		   
		   public static void main(String ar[]){
			  
			   String result=truncate("123456789012345678901234567890", 25);
			   System.out.println("result::"+result);
			   System.out.println("length::"+result.length());
		   }
	   }

