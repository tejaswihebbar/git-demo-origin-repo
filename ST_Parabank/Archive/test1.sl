com.conformiq.creator.structure.v15
creator.gui.screen qmlee24fb9df9b6422482c45914f5178c14 "Login"
{
	creator.gui.form qml6ba8fc7fd4544ad8afa5c0deddf9d9d8 "Customer Login"
	{
		creator.gui.dropdown qml08b1844ad40c4e23b7f7164494e93482 "username"
			status = dontcare
			deleted;
		creator.gui.textbox qml561bea3fa9b6456ca8d7504bc60bbc47 "password"
			type = String
			status = dontcare
			deleted;
		creator.gui.textbox qmld23a550980234376b5885281baa08814 "username"
			type = String
			status = dontcare;
		creator.gui.textbox qmle932abea2da742a39ac70072141ef95b "password"
			type = String
			status = dontcare;
	}
	creator.gui.button qml31899c44d0a340f0bbb62f65cbeef358 "Login"
		status = dontcare;
	creator.gui.hyperlink qmle80f66ea017843c5a7d750ab82c25871 "forgot user id"
		status = dontcare;
	creator.gui.hyperlink qmlc4c247069a7048acb9d4b43ee049f15a "register"
		status = dontcare;
}
creator.externalinterface qmla65dc10377574cb6b25572d92871381a "browser"
	direction = in;
creator.customaction qml0605a242e79e4051b12b9e55943b1d26 "launch url"
	interfaces = [ qmla65dc10377574cb6b25572d92871381a ]
	shortform = "LU"
	direction = in
	tokens = [ literal "launch following url" reference
qml6fa3a9dbb3944607be999d78bb6f5f5b ]
{
	creator.primitivefield qml6fa3a9dbb3944607be999d78bb6f5f5b "URL"
		type = String;
}