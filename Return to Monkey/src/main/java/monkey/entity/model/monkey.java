package monkey.entity.model;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;




public class monkey extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Head;
	private final ModelRenderer Face_r1;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail_1;
	private final ModelRenderer Tail_1_r1;
	private final ModelRenderer Tail_2;
	private final ModelRenderer Tail_2_r1;
	private final ModelRenderer Tail_3;
	private final ModelRenderer Tail_3_r1;
	private final ModelRenderer Tail_4;
	private final ModelRenderer Tail_4_r1;
	private final ModelRenderer Tail_5;
	private final ModelRenderer Tail_5_r1;
	private final ModelRenderer Tail_6;
	private final ModelRenderer Tail_6_r1;
	private final ModelRenderer LArm;
	private final ModelRenderer LArm_1_r1;
	private final ModelRenderer LForearm;
	private final ModelRenderer LArm_2_r1;
	private final ModelRenderer RArm;
	private final ModelRenderer RArm_1_r1;
	private final ModelRenderer RForearm;
	private final ModelRenderer RArm_2_r1;
	private final ModelRenderer RLeg;
	private final ModelRenderer RLeg_1_r1;
	private final ModelRenderer RLowerLeg;
	private final ModelRenderer RLeg_2_r1;
	private final ModelRenderer LLeg;
	private final ModelRenderer LLeg_1_r1;
	private final ModelRenderer LLowerLeg;
	private final ModelRenderer LLeg_2_r1;

	public monkey() {
		textureWidth = 32;
		textureHeight = 16;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, -0.0761F, -0.3827F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.6545F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 18, 3, -1.0F, -3.2066F, -0.6088F, 2, 4, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -2.9265F, -1.86F);
		Body.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.5F, -2.8996F, -2.0227F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -2.0F, -1.8996F, -1.0227F, 4, 1, 0, 0.0F, false));

		Face_r1 = new ModelRenderer(this);
		Face_r1.setRotationPoint(0.0F, -1.3996F, -2.1727F);
		Head.addChild(Face_r1);
		setRotationAngle(Face_r1, 0.0873F, 0.0F, 0.0F);
		Face_r1.cubeList.add(new ModelBox(Face_r1, 12, 3, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.5F, -0.0761F, 0.8673F);
		Body.addChild(Tail);
		

		Tail_1 = new ModelRenderer(this);
		Tail_1.setRotationPoint(-0.5F, -0.25F, -0.25F);
		Tail.addChild(Tail_1);
		

		Tail_1_r1 = new ModelRenderer(this);
		Tail_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail_1.addChild(Tail_1_r1);
		setRotationAngle(Tail_1_r1, 0.6109F, 0.0F, 0.0F);
		Tail_1_r1.cubeList.add(new ModelBox(Tail_1_r1, 12, 6, -0.5F, -0.6518F, 0.0614F, 1, 1, 2, 0.0F, false));

		Tail_2 = new ModelRenderer(this);
		Tail_2.setRotationPoint(0.0F, -1.2453F, 1.4359F);
		Tail_1.addChild(Tail_2);
		

		Tail_2_r1 = new ModelRenderer(this);
		Tail_2_r1.setRotationPoint(0.0F, -0.0047F, 0.0641F);
		Tail_2.addChild(Tail_2_r1);
		setRotationAngle(Tail_2_r1, 0.5672F, 0.0F, 0.0F);
		Tail_2_r1.cubeList.add(new ModelBox(Tail_2_r1, 22, 9, -0.5F, -0.5119F, -0.1082F, 1, 1, 1, 0.0F, false));

		Tail_3 = new ModelRenderer(this);
		Tail_3.setRotationPoint(0.0F, -0.3463F, 0.465F);
		Tail_2.addChild(Tail_3);
		

		Tail_3_r1 = new ModelRenderer(this);
		Tail_3_r1.setRotationPoint(0.0F, 0.1417F, 0.0992F);
		Tail_3.addChild(Tail_3_r1);
		setRotationAngle(Tail_3_r1, 0.6283F, 0.0F, 0.0F);
		Tail_3_r1.cubeList.add(new ModelBox(Tail_3_r1, 18, 9, -0.5F, -0.6146F, -0.0544F, 1, 1, 1, 0.0F, false));

		Tail_4 = new ModelRenderer(this);
		Tail_4.setRotationPoint(0.0F, -0.3613F, 0.5545F);
		Tail_3.addChild(Tail_4);
		

		Tail_4_r1 = new ModelRenderer(this);
		Tail_4_r1.setRotationPoint(0.0F, 0.003F, -0.0053F);
		Tail_4.addChild(Tail_4_r1);
		setRotationAngle(Tail_4_r1, 0.6109F, 0.0F, 0.0F);
		Tail_4_r1.cubeList.add(new ModelBox(Tail_4_r1, 14, 9, -0.5F, -0.5261F, -0.0189F, 1, 1, 1, 0.0F, false));

		Tail_5 = new ModelRenderer(this);
		Tail_5.setRotationPoint(0.0F, -0.3829F, 0.532F);
		Tail_4.addChild(Tail_5);
		

		Tail_5_r1 = new ModelRenderer(this);
		Tail_5_r1.setRotationPoint(0.0F, -0.0142F, 0.0127F);
		Tail_5.addChild(Tail_5_r1);
		setRotationAngle(Tail_5_r1, 0.6109F, 0.0F, 0.0F);
		Tail_5_r1.cubeList.add(new ModelBox(Tail_5_r1, 22, 11, -0.5F, -0.5119F, -0.0345F, 1, 1, 1, 0.0F, false));

		Tail_6 = new ModelRenderer(this);
		Tail_6.setRotationPoint(0.0F, -0.3798F, 0.5714F);
		Tail_5.addChild(Tail_6);
		

		Tail_6_r1 = new ModelRenderer(this);
		Tail_6_r1.setRotationPoint(0.0F, -0.0344F, 0.0913F);
		Tail_6.addChild(Tail_6_r1);
		setRotationAngle(Tail_6_r1, 0.6109F, 0.0F, 0.0F);
		Tail_6_r1.cubeList.add(new ModelBox(Tail_6_r1, 18, 11, -0.5F, -0.5887F, -0.0938F, 1, 1, 1, 0.0F, false));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(1.0F, -2.0719F, -2.389F);
		Body.addChild(LArm);
		

		LArm_1_r1 = new ModelRenderer(this);
		LArm_1_r1.setRotationPoint(0.0F, 0.2458F, 0.2563F);
		LArm.addChild(LArm_1_r1);
		setRotationAngle(LArm_1_r1, 0.9599F, 0.0F, 0.0F);
		LArm_1_r1.cubeList.add(new ModelBox(LArm_1_r1, 26, 7, 0.0F, -0.7746F, -1.7578F, 1, 1, 2, 0.0F, false));

		LForearm = new ModelRenderer(this);
		LForearm.setRotationPoint(0.6F, 1.4458F, -0.8437F);
		LArm.addChild(LForearm);
		

		LArm_2_r1 = new ModelRenderer(this);
		LArm_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LForearm.addChild(LArm_2_r1);
		setRotationAngle(LArm_2_r1, 0.7854F, 0.0F, 0.0F);
		LArm_2_r1.cubeList.add(new ModelBox(LArm_2_r1, 26, 10, -0.5519F, -0.5344F, -1.8878F, 1, 1, 2, 0.0F, false));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-1.0F, -2.0719F, -2.389F);
		Body.addChild(RArm);
		

		RArm_1_r1 = new ModelRenderer(this);
		RArm_1_r1.setRotationPoint(0.0F, 0.2458F, 0.2563F);
		RArm.addChild(RArm_1_r1);
		setRotationAngle(RArm_1_r1, 0.9599F, 0.0F, 0.0F);
		RArm_1_r1.cubeList.add(new ModelBox(RArm_1_r1, 26, 1, -1.0F, -0.8079F, -1.7669F, 1, 1, 2, 0.0F, false));

		RForearm = new ModelRenderer(this);
		RForearm.setRotationPoint(-0.5F, 1.4952F, -1.0386F);
		RArm.addChild(RForearm);
		

		RArm_2_r1 = new ModelRenderer(this);
		RArm_2_r1.setRotationPoint(0.1F, 0.1506F, 0.5949F);
		RForearm.addChild(RArm_2_r1);
		setRotationAngle(RArm_2_r1, 0.7854F, 0.0F, 0.0F);
		RArm_2_r1.cubeList.add(new ModelBox(RArm_2_r1, 26, 4, -0.6361F, -1.0344F, -1.9878F, 1, 1, 2, 0.0F, false));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.0F, 0.0F, 0.0F);
		Body.addChild(RLeg);
		

		RLeg_1_r1 = new ModelRenderer(this);
		RLeg_1_r1.setRotationPoint(0.0F, -0.5761F, -0.6327F);
		RLeg.addChild(RLeg_1_r1);
		setRotationAngle(RLeg_1_r1, -0.3927F, 0.0F, 0.0F);
		RLeg_1_r1.cubeList.add(new ModelBox(RLeg_1_r1, 9, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		RLowerLeg = new ModelRenderer(this);
		RLowerLeg.setRotationPoint(-0.5F, 1.1739F, -0.8827F);
		RLeg.addChild(RLowerLeg);
		

		RLeg_2_r1 = new ModelRenderer(this);
		RLeg_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RLowerLeg.addChild(RLeg_2_r1);
		setRotationAngle(RLeg_2_r1, 0.3927F, 0.0F, 0.0F);
		RLeg_2_r1.cubeList.add(new ModelBox(RLeg_2_r1, 13, 0, -0.5F, -0.1913F, -0.4619F, 1, 2, 1, 0.0F, false));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.0F, 0.0F, 0.0F);
		Body.addChild(LLeg);
		

		LLeg_1_r1 = new ModelRenderer(this);
		LLeg_1_r1.setRotationPoint(0.0F, -0.5761F, -0.6327F);
		LLeg.addChild(LLeg_1_r1);
		setRotationAngle(LLeg_1_r1, -0.3927F, 0.0F, 0.0F);
		LLeg_1_r1.cubeList.add(new ModelBox(LLeg_1_r1, 17, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		LLowerLeg = new ModelRenderer(this);
		LLowerLeg.setRotationPoint(0.5F, 1.1739F, -0.7827F);
		LLeg.addChild(LLowerLeg);
		

		LLeg_2_r1 = new ModelRenderer(this);
		LLeg_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LLowerLeg.addChild(LLeg_2_r1);
		setRotationAngle(LLeg_2_r1, 0.3927F, 0.0F, 0.0F);
		LLeg_2_r1.cubeList.add(new ModelBox(LLeg_2_r1, 21, 0, -0.5F, -0.2296F, -0.5543F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}