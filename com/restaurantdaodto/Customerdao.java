package com.restaurantdaodto;
interface Customerdao {
         void orderitems(Customerdto cdto)throws Exception;
         void updateorder(String itemch,int qc)throws Exception;
         void generatebill()throws Exception;
}
