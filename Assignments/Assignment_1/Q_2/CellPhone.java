package Assignments.Assignment_1.Q_2;

public class CellPhone {
    private final String os;
    private final String ui;
    private final float weight;
    private final String colors; 
    private final String cpu;
    private final String gpu;
    private final String chipSet;
    private final String displayTechnology;
    private final float displaySize;
    private final float displayResolution;
    private final int ram;
    private final int rom;
    private final String camera;
    private final float bluetoothVersion;
    private final boolean gps;
    private final boolean radio;
    private final String usbType;
    private final String supportedNetwork;
    private final boolean NFC;
    private final boolean fingerPrint;
    private final boolean torch;
    private final int batteryCapacity;
    private final float price;

    public CellPhone(CellPhone phone){
        this(phone.os, phone.ui, phone.weight, phone.colors, phone.cpu, phone.gpu, phone.chipSet, phone.displayTechnology, phone.displaySize, phone.displayResolution, phone.ram, phone.rom, phone.camera, phone.bluetoothVersion, phone.gps, phone.radio, phone.usbType, phone.supportedNetwork, phone.NFC, phone.fingerPrint, phone.torch, phone.batteryCapacity, phone.price);
    }

    public CellPhone(String os, String ui, float weight, String colors, String cpu, String gpu, String chipSet,
            String displayTechnology, float displaySize, float displayResolution, int ram, int rom, String camera,
            float bluetoothVersion, boolean gps, boolean radio, String usbType, String supportedNetwork, boolean NFC,
            boolean fingerPrint, boolean torch, int batteryCapacity, float price) {
        this.os = os;
        this.ui = ui;
        this.weight = weight;
        this.colors = colors;
        this.cpu = cpu;
        this.gpu = gpu;
        this.chipSet = chipSet;
        this.displayTechnology = displayTechnology;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.ram = ram;
        this.rom = rom;
        this.camera = camera;
        this.bluetoothVersion = bluetoothVersion;
        this.gps = gps;
        this.radio = radio;
        this.usbType = usbType;
        this.supportedNetwork = supportedNetwork;
        this.NFC = NFC;
        this.fingerPrint = fingerPrint;
        this.torch = torch;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public String getUi() {
        return ui;
    }

    public float getWeight() {
        return weight;
    }

    public String getColors() {
        return colors;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getChipSet() {
        return chipSet;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public float getDisplayResolution() {
        return displayResolution;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getCamera() {
        return camera;
    }

    public float getBluetoothVersion() {
        return bluetoothVersion;
    }

    public boolean isGps() {
        return gps;
    }

    public boolean isRadio() {
        return radio;
    }

    public String getUsbType() {
        return usbType;
    }

    public String getSupportedNetwork() {
        return supportedNetwork;
    }

    public boolean isNFC() {
        return NFC;
    }

    public boolean isFingerPrint() {
        return fingerPrint;
    }

    public boolean isTorch() {
        return torch;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public float getPrice() {
        return price;
    }

    public void call(CellPhone phone){
        phone.receiveCall();
    }

    public void receiveCall() {
        System.out.println("Someone is Calling!");
    }

    public void sendMessage(CellPhone phone, String message){
        phone.receiveMessage(message);
    }

    public void receiveMessage(String message){
        System.out.println(message);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CellPhone other = (CellPhone) obj;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (ui == null) {
            if (other.ui != null)
                return false;
        } else if (!ui.equals(other.ui))
            return false;
        if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
            return false;
        if (colors == null) {
            if (other.colors != null)
                return false;
        } else if (!colors.equals(other.colors))
            return false;
        if (cpu == null) {
            if (other.cpu != null)
                return false;
        } else if (!cpu.equals(other.cpu))
            return false;
        if (gpu == null) {
            if (other.gpu != null)
                return false;
        } else if (!gpu.equals(other.gpu))
            return false;
        if (chipSet == null) {
            if (other.chipSet != null)
                return false;
        } else if (!chipSet.equals(other.chipSet))
            return false;
        if (displayTechnology == null) {
            if (other.displayTechnology != null)
                return false;
        } else if (!displayTechnology.equals(other.displayTechnology))
            return false;
        if (Float.floatToIntBits(displaySize) != Float.floatToIntBits(other.displaySize))
            return false;
        if (Float.floatToIntBits(displayResolution) != Float.floatToIntBits(other.displayResolution))
            return false;
        if (ram != other.ram)
            return false;
        if (rom != other.rom)
            return false;
        if (camera == null) {
            if (other.camera != null)
                return false;
        } else if (!camera.equals(other.camera))
            return false;
        if (Float.floatToIntBits(bluetoothVersion) != Float.floatToIntBits(other.bluetoothVersion))
            return false;
        if (gps != other.gps)
            return false;
        if (radio != other.radio)
            return false;
        if (usbType == null) {
            if (other.usbType != null)
                return false;
        } else if (!usbType.equals(other.usbType))
            return false;
        if (supportedNetwork == null) {
            if (other.supportedNetwork != null)
                return false;
        } else if (!supportedNetwork.equals(other.supportedNetwork))
            return false;
        if (NFC != other.NFC)
            return false;
        if (fingerPrint != other.fingerPrint)
            return false;
        if (torch != other.torch)
            return false;
        if (batteryCapacity != other.batteryCapacity)
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CellPhone [OS: " + os + ", UI: " + ui + ", Weight: " + weight + ", Colors: " + colors + ", cpu: " + cpu
                + ", gpu: " + gpu + ", ChipSet: " + chipSet + ", Display Technology: " + displayTechnology
                + ", Display Size: " + displaySize + ", Display Resolution: " + displayResolution + ", ram: " + ram
                + ", rom: " + rom + ", camera: " + camera + ", Bluetooth Version: " + bluetoothVersion + ", gps: " + gps
                + ", Radio: " + radio + ", USB Type: " + usbType + ", Supported Network: " + supportedNetwork + ", NFC: "
                + NFC + ", Finger Print: " + fingerPrint + ", Torch: " + torch + ", Battery Capacity: " + batteryCapacity
                + ", Price: " + price + "]";
    }
}
