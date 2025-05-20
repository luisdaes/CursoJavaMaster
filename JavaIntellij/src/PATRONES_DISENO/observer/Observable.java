package PATRONES_DISENO.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {

  protected List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observable){
	observers.add(observable);
  }

  public void removerObserver(Observer observer){
	observers.remove(observer);
  }

  public void notifyObservers(){
	notifyObservers();
  }

  public void notifyObservers(Object object){
	for (Observer obs: this.observers){
	  obs.update(this, object);
	}
  }
}
