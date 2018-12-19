import React from 'react';
import {Link} from 'react-router-dom';
import './NavBar.css';

const NavBar = (props) => {
  return (
    <header>
    <img className="logo" src="gossip_girl_logo_white-01.png"/>
      <ul className="nav-bar">
        <li className="nav-link"> <Link to="/">HOME</Link></li>
        <li className="nav-link"> <Link to="/articles/new">+ NEW POST</Link></li>
        <li className="nav-link"> <Link to="/journalists">BLOGGERS</Link></li>
        <li className="nav-link"> <Link to="/journalists/new">+ NEW BLOGGER</Link></li>
      </ul>
    </header>

  )
}

export default NavBar;
