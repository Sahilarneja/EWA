class test2 extends Thread{
    public void run(){
        for(int i=2;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class test_unit2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test_unit2 t1=new test_unit2();
        t1.start();
        test2 t2=new test2();
        
        try{
            t2.start();
            t2.join();
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }
}

    

