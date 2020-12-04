class Decoder extends DecoderAbstraction {
    private String bufor = "";
    private String subString = "";
    private String op = "";


    public void decode(String input){
        input = op + input;
        //System.out.println(input);
        //String [] tab = input.split(" ");
        input =  input.replace(" ","");
        op = "";
        for(int i = 0; i < input.length(); i++){
                if (input.charAt(i) == '0') {

                    if (input.charAt(i + 1) == '0') {
                        bufor = "";
                    }

                    else if (input.charAt(i + 1) >= '2' && input.charAt(i + 1) <= '9') {

                       if(i + 1 == input.length() - 1) {
                           i++;
                           op += '0';
                           op += input.charAt(i);
                           //System.out.println(op);
                       }
                       else if(input.charAt(i + 2) != '0'){
                           for(int u = 0; u < (input.charAt(i + 1) - 48); u++){
                               bufor += input.charAt(i + 2);
                           }
                           i += 2;
                       }
                       else if(input.charAt(i + 2) == '0'){
                           if(i + 3 != input.length() - 1){
                               int l = i + 4;
                               while(input.charAt(l) != '0'){
                                   subString += input.charAt(l);
                                   l++;

                               }

                                   for (int y = 0; y < (input.charAt(i + 1) - 48); y++) {
                                       bufor += subString;
                                   }
                                   subString = "";
                               i = l + 1;
                           }
                           else{
                               i++;
                               op += '0';
                               op += input.charAt(i);
                               op += '0';
                               op += '1';
                               i +=2;
                           }
                       }
                    }


                }
                else {
                        bufor += input.charAt(i);
                }

        }
    }

    public String getBuffer(){
        if(bufor == null) {
            bufor = "";
            return bufor;
        }
        else{
            return bufor;
        }
    }

    public void reset(){
        bufor = "";
    }

}
