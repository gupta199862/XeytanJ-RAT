package com.melardev.xeytanj.gui.shell;

import com.melardev.xeytanj.models.Client;

public interface ShellUiListener {

    void onSendShellCommandRequested(Client client, String text);
}
