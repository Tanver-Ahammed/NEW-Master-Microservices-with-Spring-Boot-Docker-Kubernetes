import { Route, Routes } from "react-router-dom";
import NavBar from "./components/NavBar";
import Home from "./pages/Home";
import About from "./pages/About";
import SideBar from "./components/SideBar";
import Contact from "./pages/Contact";
import Help from "./pages/Help";
import CreateCards from "./pages/CreateCards";
import CreateLoans from "./pages/CreateLoans";
import CreateAccount from "./pages/CreateAccount";

const App = () => {
  return (
    <div className="flex min-h-screen">
      <SideBar />
      <div className="flex flex-col flex-1">
        <NavBar />
        <main className="p-4">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/help" element={<Help />} />
            <Route path="/create-accounts" element={<CreateAccount />} />
            <Route path="/create-loans" element={<CreateLoans />} />
            <Route path="/create-cards" element={<CreateCards />} />
          </Routes>
        </main>
      </div>
    </div>
  );
};

export default App;
