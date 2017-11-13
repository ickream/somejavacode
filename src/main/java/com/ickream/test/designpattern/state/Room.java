package com.ickream.test.designpattern.state;

import static com.ickream.test.MyUtils.*;

/**
 * Created by xf on 2017/11/6.
 */
public class Room {
    private State freeTimeState;
    private State bookedState ;
    private State checkInState ;

    private State state;

    public Room(){
        freeTimeState =new FreeTimeState(this);

        checkInState =new CheckInState(this);

        bookedState =new BookedState(this);

        state=freeTimeState;

    }
    public void bookRoom(){
        state.bookRoom();
    }
    public void unSubscribeRoom(){
        state.unSubscribeRoom();
    }
    public void checkInRoom(){
        state.checkInRoom();
    }
    public void checkOutRoom(){
        state.checkOutRoom();
    }


    public State  getFreeTimeState(){
        return this.freeTimeState;
    }
    public void setFreeTimeState(State state){
        this.state=state;
    }

    public State getCheckInState(){
        return this.checkInState;
    }
    public void setCheckInState(State state){
        this.checkInState=state;
    }

    public State getBookedState(){
        return this.bookedState;
    }
    public void setBookedState(State state){
        this.bookedState=state;
    }

    public State getState(){
        return this.state;
    }
    public void setState(State state){
        this.state=state;
    }


    public static void  main(String [] args){
        Room room=new Room();

        room.bookRoom();
        room.checkOutRoom();
        room.checkInRoom();
        room.bookRoom();
        room.checkOutRoom();
    }
}

interface  State{
    void bookRoom();

    void unSubscribeRoom();

    void checkInRoom();

    void checkOutRoom();
}

class FreeTimeState implements State{

    private Room room;
    public FreeTimeState(Room room){
        this.room=room;
    }

    @Override
    public void bookRoom(){
        print("room is booked!");
        room.setState(room.getBookedState());
    }
    @Override
    public void unSubscribeRoom(){

        print("freeRoom is cant unsubscribed!");
    }
    @Override
    public void checkInRoom(){

        room.setState(room.getCheckInState());
        print("the room is checkIn!");
    }
    @Override
    public void checkOutRoom(){

        print("free room cant checkOut!");
    }
}

class CheckInState implements State{
    private Room room;

    public CheckInState(Room room){
        this.room=room;
    }
    @Override
    public void bookRoom(){

        print("check in room cant booked");
    }

    @Override
    public void unSubscribeRoom(){

        print("chenk in room cant unsubscribe!");
    }
    @Override
    public void checkInRoom(){
        print("chek in room cant checkin!");

    }
    @Override
    public void checkOutRoom(){
        room.setState(room.getFreeTimeState());
        print("the room is free now!");
    }
}

class BookedState implements  State{
    private Room room;

    public BookedState(Room room){
        this.room=room;
    }
    @Override
    public void bookRoom(){
        print("the booked room cant book !");

    }
    @Override
    public void unSubscribeRoom(){

        room.setState(room.getFreeTimeState());
        print("the room is unsubscribe now !");
    }
    @Override
    public void checkInRoom(){
        room.setState(room.getCheckInState());
        print("the room is checkIn now!");

    }
    @Override
    public void checkOutRoom(){
        print("booked room cant checkOut!");
    }
}
