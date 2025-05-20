import { Link } from "react-router-dom";
import { assets } from "../assets/assets";
import { useState } from "react";
import { FaAddressCard } from "react-icons/fa";
import { MdAccountBalance } from "react-icons/md";
import { PiSignatureFill } from "react-icons/pi";

const SideBar = () => {
  const [extended, setExtended] = useState(false);

  return (
    <div className="min-h-screen flex flex-col justify-between bg-gray-200 px-4 py-6 w-fit">
      {/* Top */}
      <div>
        <img
          onClick={() => setExtended((prev) => !prev)}
          className="w-5 cursor-pointer mb-6 ml-2"
          src={assets.menu_icon}
          alt="menu"
        />

        <div className="flex items-center gap-2 px-4 py-2 bg-[#e6eaf1] rounded-full text-gray-500 text-sm cursor-pointer">
          <img src={assets.plus_icon} alt="new chat" className="w-5" />
          {extended && <p>New Chat</p>}
        </div>

        {extended && (
          <div className="flex flex-col mt-8">
            <p className="text-gray-600 text-sm mb-4">Employee Activity</p>

            <Link to="create-accounts">
              <div className="flex items-start gap-2 px-3 py-2 pr-10 rounded-full cursor-pointer hover:bg-[#e2e6eb] text-[#282828] text-sm">
                <MdAccountBalance className="w-5 h-5" />
                <p>Create Accounts</p>
              </div>
            </Link>

            <Link to="create-loans">
              <div className="flex items-start gap-2 px-3 py-2 pr-10 rounded-full cursor-pointer hover:bg-[#e2e6eb] text-[#282828] text-sm">
                <PiSignatureFill className="w-5 h-5" />
                <p>Create Loans</p>
              </div>
            </Link>

            <Link to="create-cards">
              <div className="flex items-start gap-2 px-3 py-2 pr-10 rounded-full cursor-pointer hover:bg-[#e2e6eb] text-[#282828] text-sm">
                <FaAddressCard className="w-5 h-5" />
                <p>Create Cards</p>
              </div>
            </Link>
          </div>
        )}
      </div>

      {/* Bottom */}
      <div className="space-y-3 text-sm text-[#282828]">
        <Link to="help">
          <div className="flex items-start gap-2 px-3 py-2 rounded-full cursor-pointer hover:bg-[#e2e6eb]">
            <img src={assets.question_icon} alt="help" className="w-5" />
            {extended && <p>Help</p>}
          </div>
        </Link>
        <div className="flex items-start gap-2 px-3 py-2 rounded-full cursor-pointer hover:bg-[#e2e6eb]">
          <img src={assets.setting_icon} alt="settings" className="w-5" />
          {extended && <p>Settings</p>}
        </div>
      </div>
    </div>
  );
};

export default SideBar;
