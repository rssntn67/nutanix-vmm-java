package it.arsinfo.nutanix;

import java.util.List;

import com.nutanix.dp1.vmm.vmm.v4.ahv.config.ListVmsResponse;
import com.nutanix.dp1.vmm.vmm.v4.ahv.config.Vm;
import com.nutanix.vmm.java.client.ApiClient;
import com.nutanix.vmm.java.client.api.VmApi;

public class NutanixPrismVmmClient {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        VmApi vmApi = new VmApi(apiClient);

        ListVmsResponse listVmsResponse = vmApi.listVms(null,null,null,null, null, null);
        List<Vm> vmlist = (List<Vm>) listVmsResponse.getData();

        for (Vm vm: vmlist) {
            vm.getMachineType();
        }

    }
}
