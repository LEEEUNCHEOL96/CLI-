package org.example;

public class Request {
    private int  id;
    private String commandList2;

    public Request(String command){
        String[] commandList = command.split("\\?", 2);
        String commandList2 = commandList[0];
        String[] commandList3 = commandList[1].split("=", 2);

        String key = commandList3[0];
        String removeId = commandList3[1];
        int id = Integer.parseInt(removeId);
    }

    public String getCommandList2(){
        return commandList2;
    }
    public int getId(){
        return id;
    }
}
