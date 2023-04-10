 class Thread_Basic extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
            System.out.println(Thread.currentThread().getName()+" : "+i);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t=currentThread();
        t.setName("Main Thread");
        System.out.println(Thread.currentThread().getName());
        Thread_Basic tb=new Thread_Basic();
        try {
            tb.start();
            tb.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}