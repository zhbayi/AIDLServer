package com.aaron.aidlserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import com.aaron.aidlserver.ICalculate;

public class CalculateService extends Service {
    public CalculateService() {
    }

    private Binder mBinder = new ICalculate.Stub(){

        @Override
        public int add(int first, int second) throws RemoteException {
            return first + second;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
