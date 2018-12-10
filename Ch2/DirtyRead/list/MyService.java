package Ch2.DirtyRead.list;
//this is the business logic class

public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data) {
        try{
            //it will cause dirty-read,because the two thread will call this method asynchronized
            //and list will be added 2 items
            //solved by add synchronized (list)
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);//simulate get data from remote server spend 2s
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
