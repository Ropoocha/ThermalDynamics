package thermaldynamics.plugins.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import thermaldynamics.ThermalDynamics;

@SuppressWarnings("UnusedDeclaration")
public class NEIThermalDynamicsConfig implements IConfigureNEI {
    @Override
    public void loadConfig() {
        API.registerRecipeHandler(CoverRecipeNEIHandler.instance);
        API.registerUsageHandler(CoverRecipeNEIHandler.instance);
    }

    @Override
    public String getName() {
        return ThermalDynamics.modName;
    }

    @Override
    public String getVersion() {
        return ThermalDynamics.version;
    }
}