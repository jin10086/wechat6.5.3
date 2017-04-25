package com.tencent.mm.ui.account.mobile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.mm.f.a;
import com.tencent.mm.model.ak;
import com.tencent.mm.modelfriend.u;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.v.e;
import com.tencent.mm.v.k;
import com.tencent.mmdb.database.SQLiteDatabase;

public final class b implements com.tencent.mm.ui.account.mobile.MobileInputUI.b, e {
    private int nKA = 0;
    private String nKr;
    private String nKs;
    private MobileInputUI nNH;

    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] nNJ = new int[a.bBs().length];

        static {
            try {
                nNJ[a.nNZ - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    public final void a(MobileInputUI mobileInputUI) {
        this.nNH = mobileInputUI;
        mobileInputUI.nIE.requestFocus();
        mobileInputUI.aJs();
        String string = mobileInputUI.getString(2131234448);
        if (d.lWk) {
            string = string + mobileInputUI.getString(2131230892);
        }
        mobileInputUI.Fd(string);
        mobileInputUI.nNR.setVisibility(8);
        mobileInputUI.nKu.setVisibility(8);
        mobileInputUI.nKt.setVisibility(8);
    }

    public final void start() {
        ak.vy().a(145, (e) this);
        com.tencent.mm.plugin.a.b.b(true, ak.uR() + "," + getClass().getName() + ",F200_100," + ak.dR("F200_100") + ",1");
        com.tencent.mm.plugin.a.b.mh("F200_100");
        this.nKA = 0;
    }

    public final void stop() {
        ak.vy().b(145, (e) this);
        com.tencent.mm.plugin.a.b.b(false, ak.uR() + "," + getClass().getName() + ",F200_100," + ak.dR("F200_100") + ",2");
    }

    public final void vW(int i) {
        switch (AnonymousClass5.nNJ[i - 1]) {
            case 1:
                String str = this.nNH.nIP + this.nNH.hUm;
                if (this.nNH.nIO != null) {
                    v.d("MicroMsg.MobileInputForgetPwdLogic", "already checking ");
                    return;
                }
                MobileInputUI mobileInputUI = this.nNH;
                Context context = this.nNH;
                this.nNH.getString(2131231164);
                mobileInputUI.nIO = g.a(context, this.nNH.getString(2131234410), true, new OnCancelListener(this) {
                    final /* synthetic */ b nNI;

                    {
                        this.nNI = r1;
                    }

                    public final void onCancel(DialogInterface dialogInterface) {
                    }
                });
                String bBT = this.nNH.nKq.bBT();
                int i2 = (this.nKr == null || this.nKs == null || bBT.equals(this.nKr) || !bBT.equals(this.nKs)) ? (this.nKr == null || this.nKs == null || this.nKs.equals(this.nKr) || bBT.equals(this.nKs)) ? 0 : 2 : 1;
                k uVar = new u(str, 12, SQLiteDatabase.KeyEmpty, 0, SQLiteDatabase.KeyEmpty);
                uVar.fq(this.nKA);
                uVar.fr(i2);
                ak.vy().a(uVar, 0);
                this.nKr = this.nNH.nKq.bBT();
                this.nKA++;
                return;
            default:
                return;
        }
    }

    public final void a(int i, int i2, String str, k kVar) {
        v.i("MicroMsg.MobileInputForgetPwdLogic", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (this.nNH.nIO != null) {
            this.nNH.nIO.dismiss();
            this.nNH.nIO = null;
        }
        if (i2 == -75) {
            g.f(this.nNH, 2131230895, 2131234378);
        } else if (i2 == -41 || i2 == -59) {
            r0 = a.dm(str);
            if (r0 != null) {
                r0.a(this.nNH, null, null);
            } else {
                g.f(this.nNH, 2131234422, 2131234423);
            }
        } else if (kVar.getType() == 145) {
            int AG = ((u) kVar).AG();
            if (AG == 12) {
                if (i2 == -36 || i2 == -35 || i2 == -3) {
                    String Fk = ((u) kVar).Fk();
                    if (!be.kS(Fk)) {
                        this.nNH.hUm = Fk.trim();
                    }
                    this.nNH.hUm = al.Kq(this.nNH.hUm);
                    this.nKs = this.nNH.nIP + this.nNH.hUm;
                    com.tencent.mm.plugin.a.b.b(true, ak.uR() + "," + getClass().getName() + ",F200_200," + ak.dR("F200_200") + ",1");
                    r0 = a.dm(str);
                    if (r0 != null) {
                        r0.a(this.nNH, new OnClickListener(this) {
                            final /* synthetic */ b nNI;

                            {
                                this.nNI = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                this.nNI.bBp();
                                com.tencent.mm.plugin.a.b.b(true, ak.uR() + "," + getClass().getName() + ",F200_200," + ak.dR("F200_200") + ",2");
                            }
                        }, new OnClickListener(this) {
                            final /* synthetic */ b nNI;

                            {
                                this.nNI = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                com.tencent.mm.plugin.a.b.b(true, ak.uR() + "," + getClass().getName() + ",F200_200," + ak.dR("F200_200") + ",2");
                            }
                        });
                        return;
                    }
                    bBp();
                    com.tencent.mm.plugin.a.b.b(true, ak.uR() + "," + getClass().getName() + ",F200_200," + ak.dR("F200_200") + ",2");
                    return;
                } else if (i2 == -34) {
                    g.A(this.nNH, this.nNH.getString(2131231402), SQLiteDatabase.KeyEmpty);
                    return;
                } else {
                    Toast.makeText(this.nNH, this.nNH.getString(2131231444, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
            if (AG == 8 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("bindmcontact_mobile", this.nNH.nIP + " " + this.nNH.nKq.bBT());
                intent.putExtra("bindmcontact_shortmobile", this.nNH.hUm);
                intent.putExtra("country_name", this.nNH.cQn);
                intent.putExtra("couttry_code", this.nNH.bfd);
                intent.putExtra("mobileverify_countdownsec", ((u) kVar).Fm());
                intent.putExtra("mobileverify_countdownstyle", ((u) kVar).Fn());
                intent.putExtra("mobileverify_fb", ((u) kVar).Fo());
                intent.putExtra("mobileverify_reg_qq", ((u) kVar).Fq());
                intent.putExtra("mobile_verify_purpose", 3);
                intent.setClass(this.nNH, MobileVerifyUI.class);
                this.nNH.startActivity(intent);
            }
        }
    }

    private void bBp() {
        MobileInputUI mobileInputUI = this.nNH;
        Context context = this.nNH;
        this.nNH.getString(2131231164);
        mobileInputUI.nIO = g.a(context, this.nNH.getString(2131234410), true, new OnCancelListener(this) {
            final /* synthetic */ b nNI;

            {
                this.nNI = r1;
            }

            public final void onCancel(DialogInterface dialogInterface) {
            }
        });
        ak.vy().a(new u(this.nNH.nIP + this.nNH.hUm, 8, SQLiteDatabase.KeyEmpty, 0, SQLiteDatabase.KeyEmpty), 0);
    }
}
