package building;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Oleh on 22.10.2016.
 */
public class Resource {

    public int availableMetal;
    public int availableCrystal;
    public int availableDeuterium;
    public int availableDarkmatter;
    public int availableEnergy;
    public int metalWarehouseStorage;
    public int crystalWarhouseStorage;
    public int deuteriumWarehouseStorage;
    SelenideElement availableMetalLocator = $("#resources_metal");
    SelenideElement availableCrystalLocator = $("#resources_crystal");
    SelenideElement availableDeuteriumLocator = $("#resources_deuterium");
    SelenideElement availableDarkmatterLocator = $("#resources_darkmatter");
    SelenideElement availableEnergyLocator = $("#resources_energy");
    //    SelenideElement metalWarehouseLocator = $(".overmark.left2");
//    SelenideElement crysltalWarehouseLocator = $(".overmark.left2");
    SelenideElement deuteriumWarehouseLocator = $(".normalmark left2");
    private String resourceSettingsURL = "https://s135-ru.ogame.gameforge.com/game/index.php?page=resourceSettings";

    public int getAvailableMetal() {
        String temp = availableMetalLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            try {
                availableMetal = Integer.parseInt(newTemp);
                return availableMetal;
            } catch (NumberFormatException e) {
                throw e;
            }
        } else {
            try {
                int availableMetal = Integer.parseInt(temp);
                return availableMetal;
            } catch (NumberFormatException e) {
                throw e;
            }

        }
    }

    private int getAvailableCrystal() {
        String temp = availableCrystalLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            availableCrystal = Integer.parseInt(newTemp);
            return availableCrystal;
        } else {
            int availableCrystal = Integer.parseInt(temp);
            return availableCrystal;
        }
    }

    private int getAvailableDeuterium() {
        String temp = availableDeuteriumLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            availableDeuterium = Integer.parseInt(newTemp);
            return availableDeuterium;
        } else {
            availableDeuterium = Integer.parseInt(temp);
            return availableDeuterium;
        }
    }

    private int getAvailableDarkmatter() {
        String temp = availableDarkmatterLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            availableDarkmatter = Integer.parseInt(newTemp);
            return availableDarkmatter;
        } else {
            availableDarkmatter = Integer.parseInt(temp);
            return availableDarkmatter;
        }
    }

    private int getAvailableEnergy() {
        String temp = availableEnergyLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            availableEnergy = Integer.parseInt(newTemp);
            return availableEnergy;
        } else {
            availableEnergy = Integer.parseInt(temp);
            return availableEnergy;
        }
    }

    public void test() {
        getAvailableMetal();
        getAvailableCrystal();
        getAvailableDarkmatter();
        getAvailableDeuterium();
        getAvailableEnergy();
        System.out.println(
                "Metal : " + availableMetal + "\n" +
                        "Crystal: " + availableCrystal + "\n" +
                        "Darkmatter: " + availableDarkmatter + "\n" +
                        "Deuterium: " + availableDeuterium + "\n" +
                        "Energy: " + availableEnergy + "\n");
    }

    //OP: This is horrible idea. Need to discuss with RB

    private int getWarehouseStorageForMetal() {
        open(resourceSettingsURL);
        String temp = $$(".overmark.left2").get(0).getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            metalWarehouseStorage = Integer.parseInt(newTemp);
            return metalWarehouseStorage;
        } else {
            metalWarehouseStorage = Integer.parseInt(temp);
            return metalWarehouseStorage;
        }
    }

    private int getWarehouseStorageForCrystal() {
        open(resourceSettingsURL);
        String temp = $$(".overmark.left2").get(1).getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            crystalWarhouseStorage = Integer.parseInt(newTemp);
            return crystalWarhouseStorage;
        } else {
            crystalWarhouseStorage = Integer.parseInt(temp);
            return crystalWarhouseStorage;
        }
    }

    private int getWarehouseStorageForDeuterium() {
        open(resourceSettingsURL);
        String temp = deuteriumWarehouseLocator.getText();
        if (temp.contains(".")) {
            String newTemp = temp.replace(".", "");
            deuteriumWarehouseStorage = Integer.parseInt(newTemp);
            return deuteriumWarehouseStorage;
        } else {
            deuteriumWarehouseStorage = Integer.parseInt(temp);
            return deuteriumWarehouseStorage;
        }
    }
}
