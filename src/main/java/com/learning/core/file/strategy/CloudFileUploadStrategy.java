package com.learning.core.file.strategy;

import com.learning.core.config.FileModeEnum;
import com.learning.core.util.CoolPluginInvokers;
import com.learning.modules.plugin.entity.PluginInfoEntity;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component("cloudFileUploadStrategy")
public class CloudFileUploadStrategy implements FileUploadStrategy {

    @Override
    public Object upload(MultipartFile[] files, HttpServletRequest request, PluginInfoEntity pluginInfoEntity)
            throws IOException {
        return CoolPluginInvokers.invokePlugin(pluginInfoEntity.getKey());
    }

    @Override
    public Map<String, String> getMode(String key) {
        try{
            Object mode = CoolPluginInvokers.invoke(key, "getMode");
            if (Objects.nonNull(mode)) {
                return (Map) mode;
            }
        } catch (Exception ignore){}
        return Map.of("mode", FileModeEnum.CLOUD.value(),
            "type", FileModeEnum.CLOUD.type());
    }
}
