package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class adb extends a {
    public int key;
    public int length;
    public long mEb;
    public int mEc;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.key);
            aVar.C(2, this.mEb);
            aVar.dV(3, this.length);
            aVar.dV(4, this.mEc);
            return 0;
        } else if (i == 1) {
            return (((a.a.a.a.dS(1, this.key) + 0) + a.a.a.a.B(2, this.mEb)) + a.a.a.a.dS(3, this.length)) + a.a.a.a.dS(4, this.mEc);
        } else {
            if (i == 2) {
                a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
                adb com_tencent_mm_protocal_c_adb = (adb) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        com_tencent_mm_protocal_c_adb.key = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        com_tencent_mm_protocal_c_adb.mEb = aVar3.pMj.mI();
                        return 0;
                    case 3:
                        com_tencent_mm_protocal_c_adb.length = aVar3.pMj.mH();
                        return 0;
                    case 4:
                        com_tencent_mm_protocal_c_adb.mEc = aVar3.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
