package ejercicios.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Refactoring {



	public List<Item> start(List<Item> items) {
        
		int mediumQuality = 50;
		
		int topQuality = 100;
		
		initItems(items, mediumQuality, topQuality);

		for (int i = 0; i < items.size(); i++) {
			
			Item item = items.get(i);
            
			if ( isABike(item) && item.getQuality() > 0) {

				item.setQuality(item.getQuality()-1);
                
            } else if (isLowQuality(mediumQuality, item)) {
                	
                	item.setQuality(item.getQuality()+1);
                	
                    if (item.getName().equals("Bus") && item.getSold() < 11 && isLowQuality(mediumQuality, item)) {
                       
                            	item.setQuality(item.getQuality() + 1);
                            
                        }

                        if (item.getSold() < 6) {
                           
                        	if (isLowQuality(mediumQuality, item)) {
                            	
                        		item.setQuality(item.getQuality() + 1);
                            }
                        }
                    }
				
            

            if (!item.getName().equals("Truk")) {
            	
            	item.setSold(item.getSold() - 1);
            } 

            if (item.getSold() < 0) {
                
            	if (!item.getName().equals("Car")) {
                
            		if (!item.getName().equals("Bus")) {
                    
            			if (item.getQuality() > 0) {
                        
            				if (!item.getName().equals("Truk")) {
                          
            					item.setQuality(item.getQuality() - 1);
                            }
                        }
                    } else {
                    	
                    	item.setQuality(item.getQuality() - item.getQuality());
                    }
                } else {
                    
                	if (isLowQuality(mediumQuality, item)) {
                    	
                    	item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
		return items;
	}

	public void initItems(List<Item> items, int mediumQuality, int topQuality) {
		if(items == null || items.size() == 0) {
			items.add(new Item("Car",topQuality,10));
            items.add(new Item("Bus",mediumQuality,20));
            items.add(new Item("Truck",0,0));
            items.add(new Item("Bike",mediumQuality,15));
        }
	}

	public boolean isLowQuality(int mediumQuality, Item item) {
		return item.getQuality() < mediumQuality;
	}

	public boolean isABike(Item item) {
		
		return "Bike".equalsIgnoreCase(item.getName());
	}

}
