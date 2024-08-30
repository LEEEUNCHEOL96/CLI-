package org.example;

public class Request {
    private String actionCode;
    private int  id;


    public Request(String command){
        String[] commandList = command.split("\\?", 2);
        actionCode = commandList[0];
        if(commandList.length == 1) return; /// 해결완료...드디어 마침내...

        String[] commandList2 = commandList[1].split("=", 2);

        String key = commandList2[0];
        String removeId = commandList2[1];
        id = Integer.parseInt(removeId);

    }

    public String getActionCode(){
        return actionCode;
    }
    public int getId(){
        return id;
    }
}

